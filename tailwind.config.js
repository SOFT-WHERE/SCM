module.exports = {
  purge: ['./src/main/resources/**/*.{js,jsx,ts,tsx,html}'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {},
  },
  variants: {
    extend: {},
  },
  plugins: [],
  darkMode:"selector",
}





// purge: ['./src/main/resources/**/*.{js,jsx,ts,tsx,html}', './public/index.html'],
// npx @tailwindcss/cli -i ./src/main/resources/static/css/input.css -o ./src/main/resources/static/css/output.css --watch