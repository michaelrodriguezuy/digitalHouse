import { useContext } from "react";
import ThemeContext from "../context";

// eslint-disable-next-line react/prop-types
const Layout = ({children}) => {
  const { theme } = useContext(ThemeContext);

  return (
    <div style={{ background: theme.background, color: theme.font }}>
        {children}
    </div>
  );
};

export default Layout;
