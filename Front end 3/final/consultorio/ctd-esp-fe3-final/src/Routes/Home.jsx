
import { useContext } from "react";
import Card from "../Components/Card";
import { ContextGlobal } from "../Components/utils/global.context";


const Home = () => {

  const { state, data } = useContext(ContextGlobal);

  const theme = state.theme;
  const dentistas = data.getData;

  return (
    <main >
      <h1>Inicio</h1>
      <div className="card-grid">
        {dentistas.length
          ? dentistas.map((card) => (
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
