import ReactDOM from "react-dom/client";
import App from "./App.jsx";
import "./index.css";

import { BrowserRouter, Route, Routes } from "react-router-dom";
import { ContextProvider } from "./Components/utils/global.context.jsx";

import Home from "./Routes/Home";
import Contact from "./Routes/Contact";
import Detail from "./Routes/Detail";
import Favs from "./Routes/Favs";

ReactDOM.createRoot(document.getElementById("root")).render(
  
    <ContextProvider>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<App />}>
            <Route index element={<Home />} />
            <Route path="contact" element={<Contact />} />
            <Route path="dentist/:id" element={<Detail />} />
            <Route path="favs" element={<Favs />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </ContextProvider>
  
);
