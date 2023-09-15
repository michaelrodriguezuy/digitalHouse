import { Link } from "react-router-dom";

import { useContext } from "react";
import { ContextGlobal } from "../Components/utils/global.context";

const Navbar = () => {
  const { state, dispatch } = useContext(ContextGlobal);
  const theme = state.theme;

  const handleChangeTheme = () => {
    dispatch({ type: "CHANGE_THEME" });
  };

  return (
    <nav className={`${theme}`}>
      <img
        src="../../src/assets/odontologia.png"
        alt="consultorio odontológico"
        width="70em"
      />
      <ul>
        <li>
          <Link className="text-nav" to="/">Inicio</Link>
        </li>
        <li>
          <Link className="text-nav" to="/contact">Contacto</Link>
        </li>
        <li>
          <Link className="text-nav" to="/favs">Favoritos</Link>
        </li>
      </ul>

      <button className="button-theme" onClick={handleChangeTheme}>
        Cambiar tema
      </button>
    </nav>
  );
};

export default Navbar;
