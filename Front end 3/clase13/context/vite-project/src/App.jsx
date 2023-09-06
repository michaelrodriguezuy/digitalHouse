import { useState } from "react";
import ThemeContext, { themes } from "./context";

import Navbar from "./components/Navbar";
import Body from "./components/Body";
import Layout from "./components/Layout";

function App() {
  const [theme, setTheme] = useState(themes.light);

  const handleChangeTheme = () => {
    theme === themes.light ? setTheme(themes.dark) : setTheme(themes.light);
  };

  return <div>
    
    <ThemeContext.Provider value={{theme, handleChangeTheme}}>
      <Layout>
        <Navbar />
        <Body />
      </Layout>
    </ThemeContext.Provider>

  </div>;
}

export default App;
