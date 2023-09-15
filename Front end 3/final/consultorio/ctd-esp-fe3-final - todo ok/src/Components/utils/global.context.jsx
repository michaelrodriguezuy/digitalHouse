import { createContext, useContext, useReducer } from "react";

export const initialState = { theme: "", data: [] };
export const ContextGlobal = createContext(undefined);

export const ContextProvider = ({ children }) => {
  
  const reducer = (state, action) => {
    switch (action.type) {
      case "CHANGE_THEME":
        return { ...state, theme: state.theme === "dark" ? "light" : "dark" };
      default:
        return state;
    }
  };
  
  const [state, dispatch] = useReducer(reducer, initialState);
  
 
  // debo consumir una API para obtener los datos de los dentistas utilizando useReducer y Axios. Ya tengo una const reducer


  // const initialState = { getData: "", data: [] };

  // const reducer = (state, action) => {
  //   switch (action.type) {
  //     case "GET_DATA":
  //       return { ...state, data: action.payload };
  //     default:
  //       return state;
  //   }
  // };
  // const [data, dispatch] = useReducer(reducer, initialState);
  // useEffect(() => {
  //   axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
  //     dispatch({ type: "GET_DATA", payload: response.data });
  //   });
  // }, []);

  return (
    <ContextGlobal.Provider value={{ state, dispatch }}>
      {children}
    </ContextGlobal.Provider>
  );
};
