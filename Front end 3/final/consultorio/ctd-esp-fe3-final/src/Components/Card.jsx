import { useEffect, useReducer } from "react";
import { Link } from "react-router-dom";

const reducer = (state, action) => {
  switch (action.type) {
    case "ADD_FAV":
      return { ...state, favs: [...state.favs, action.payload] };
    default:
      return state;
  }
};

const Card = ({ name, username, id }) => {
  const [state, dispatch] = useReducer(reducer, {
    favs: JSON.parse(localStorage.getItem("favs")) || [],
  });

  useEffect(() => {
    localStorage.setItem("favs", JSON.stringify(state.favs));
  }, [state.favs]);

  const addFav = () => {
    const card = {
      name,
      username,
      id,
    };
    if (!state.favs.some((fav) => fav.id === card.id)) {
      dispatch({ type: "ADD_FAV", payload: card });
      alert("Se agregó a favoritos");
    } else {
      alert("Ya está en favoritos");
    }
  };

  return (
    <div className="card">
      <img src="..\..\src\assets\doctor.jpg" alt={name} />
      <Link to={`/dentist/${id}`}>
        <h4>{name}</h4>
      </Link>

      <p>{username}</p>

      <button onClick={addFav} className="favButton">
        <span role="img" aria-label="star">
          ⭐
        </span>
      </button>
    </div>
  );
};

export default Card;
