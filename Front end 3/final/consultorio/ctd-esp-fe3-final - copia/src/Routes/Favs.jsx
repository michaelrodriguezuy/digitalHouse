import { useContext, useEffect, useState } from "react";
import Card from "../Components/Card";
import { ContextGlobal } from "../Components/utils/global.context";

const Favs = () => {
  
  const { state } = useContext(ContextGlobal);
  const theme = state.theme;
  
  const [favs, setFavs] = useState([]);
  
  useEffect(() => {
    const favs = JSON.parse(localStorage.getItem("favs")) || [];
    setFavs(favs);
  }, []);

  const handleClearFavorites = () => {
    localStorage.removeItem("favs");    
    setFavs([]);    
  };

  return (
    <div className={`${theme}`}>
      <h1>Tus dentistas favoritos {favs.length > 0 && (
        <button className="button-favs-clean" onClick={handleClearFavorites} >
          🗑️ <span className="tooltip">Limpiar favoritos</span>
        </button>
      )} </h1>
      <div className="card-grid">
        {favs.length
          ? favs.map((card) => (
              <div key={card.id}>
                <Card name={card.name} username={card.username} id={card.id} />
              </div>
            ))
          : null}
      </div>
      
    </div>
  );
};

export default Favs;
