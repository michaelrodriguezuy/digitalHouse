import { Link } from "react-router-dom";

const Card = ({ name, username, id }) => {

  const addFav = () => {
    const favs = JSON.parse(localStorage.getItem("favs")) || [];
    const card = {
      name,
      username,
      id,
    };
    favs.push(card);
    localStorage.setItem("favs", JSON.stringify(favs));
  };
  
  // const [data, dispatch] = useReducer( reducer, initialState);
  // const reducer = (state, action) => {
  //   switch (action.type) {
  //     case "ADD_FAV":
  //       return { ...state, data: action.payload };
  //     default:
  //       return state;
  //   }
  // };
  // const addFav = () => {
      
  //   const favs = JSON.parse(localStorage.getItem("favs")) || [];

  //   const card = {
  //     name,
  //     username,
  //     id,
  //   };

  //   favs.push(card);
  //   localStorage.setItem("favs", JSON.stringify(favs));
  //   dispatch({ type: "ADD_FAV", payload: favs });
  // };


  return (
    <div className="card">
      <img src="..\..\src\assets\doctor.jpg" alt={name} />
      <Link to={`/dentist/${id}`}>
        <h2>{name}</h2>
      </Link>

      <h3>{username}</h3>

      <button onClick={addFav} className="favButton">
        <span role="img" aria-label="star">
          ⭐
        </span>
      </button>
    </div>
  );
};

export default Card;
