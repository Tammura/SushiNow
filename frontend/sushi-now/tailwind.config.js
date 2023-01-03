/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./pages/**/*.{js,ts,jsx,tsx}",
    "./components/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        primary: "#FF6957",
        black: "#000000",
        white: "#ffffff",
        lightGray: "#848484",
      },
    },
  },
  plugins: [],
};
