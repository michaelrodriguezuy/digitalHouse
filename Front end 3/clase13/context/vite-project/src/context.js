import { createContext } from 'react';

export const themes = {
    light: {
        font: '#000000',
        background: '#eeeeee',
    },
    dark: {
        font: '#ffffff',
        background: '#222222',
    },
}

const ThemeContext = createContext();
export default ThemeContext;
