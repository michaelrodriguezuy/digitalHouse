
import { useContext, useEffect, useReducer, useState } from "react";
import axios from "axios";
import Card from "../Components/Card";
import { ContextGlobal } from "../Components/utils/global.context";

export const initialState = { getData: "", data: [] };

const Home = () => {
  const [cards, setCards] = useState([]);

  const { state } = useContext(ContextGlobal);
  const theme = state.theme;

  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
      setCards(response.data);
    });
  }, []);

  
  // const [data, dispatch] = useReducer( reducer, initialState);
  
  // const reducer = (state, action) => {
  //   switch (action.type) {
  //     case "GET_DATA":
  //       return { ...state, data: action.payload };
  //     default:
  //       return state;
  //   }
  // };

  // useEffect(() => {
  //   axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
  //     dispatch({ type: "GET_DATA", payload: response.data });
  //   });
  // }, []);

  return (
    <main className={`${theme}`}>
      <h1>Inicio</h1>
      <div className="card-grid">
        {cards.length
          ? cards.map((card) => (
              <div key={card.id}>
                <Card name={card.name} username={card.username} id={card.id} />
              </div>
            ))
          : null}
      </div>
    </main>
  );
};

export default Home;
