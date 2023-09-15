import { Link } from "react-router-dom";

import { useContext, useEffect, useState } from "react";
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
          <Link className="text-nav" to="/">
            Inicio
          </Link>
        </li>
        <li>
          <Link className="text-nav" to="/contact">
            Contacto
          </Link>
        </li>

        <li>          
          <Link className="text-nav" to="/favs">
            Favoritos
          </Link>          
        </li>

        <li>
          <button className="button-theme" onClick={handleChangeTheme}>
            <span role="img" aria-label="theme-icon">
              {theme === "dark" ? "☀️" : "🌙"}
            </span>
          </button>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
