import axios from "axios";
import { createContext, useEffect, useReducer } from "react";

export const initialStateTheme = { theme: "", data: [] };
export const initialStateApi = { getData: "", data: [] };

export const ContextGlobal = createContext(undefined);

export const ContextProvider = ({ children }) => {
  const reducerTheme = (state, action) => {
    switch (action.type) {
      case "CHANGE_THEME":
        return { ...state, theme: state.theme === "dark" ? "light" : "dark" };
      default:
        return state;
    }
  };
  const [state, dispatch] = useReducer(reducerTheme, initialStateTheme);

  const reducerApi = (data, action) => {
    switch (action.type) {
      case "GET_DATA":
        return { ...data, getData: action.payload };
      default:
        return data;
    }
  };
  const [data, dispatch2] = useReducer(reducerApi, initialStateApi);

  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      dispatch2({ type: "GET_DATA", payload: response.data });
    });
  }, []);

  return (
    <ContextGlobal.Provider value={{ state, dispatch, data, dispatch2 }}>
      {children}
    </ContextGlobal.Provider>
  );
};
