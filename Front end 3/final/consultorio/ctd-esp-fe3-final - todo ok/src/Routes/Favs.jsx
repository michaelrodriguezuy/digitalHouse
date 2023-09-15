import { useContext } from "react";
import Card from "../Components/Card";
import { ContextGlobal } from "../Components/utils/global.context";

const Favs = () => {
  const favs = JSON.parse(localStorage.getItem("favs")) || [];

  const { state } = useContext(ContextGlobal);
  const theme = state.theme;

  return (
    <div className={`${theme}`}>
      <h1>Tus dentistas favoritos</h1>
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
