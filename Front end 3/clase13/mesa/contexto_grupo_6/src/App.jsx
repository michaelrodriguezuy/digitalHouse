import './App.css'
import React, { useState } from 'react'
import LanguageContext, { languages } from './context';
import Navbar from './components/Navbar';
import Body from './components/Body';

function App() {

  const [language, setLanguage] = useState(languages.english);

  const handleChangeLA = () => {

      const languageActual = language

      if(languageActual.id == "EN"){
        setLanguage(languages.portuguez)
      }
      else if (languageActual.id == "PR"){
        setLanguage(languages.spanish)
      }
      else if (languageActual.id == "ES")    {
        setLanguage(languages.english)
      }
  }

  return (
    <div className="App">
      <LanguageContext.Provider value={{language,handleChangeLA}}>
        <Navbar />
        <Body />
      </LanguageContext.Provider>
    </div>
  )
}

export default App