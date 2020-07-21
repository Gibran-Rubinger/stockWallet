/*script to do the 'X' moviment on the bars*/
const bars = document.querySelector('.menu-toggle .barsMovimet')
/*script to do the moviment of the toggle menu*/
const menuToggle = document.querySelector('.menu-toggle');
const nav = document.querySelector('nav');
menuToggle.addEventListener('click', () => {
    nav.classList.toggle('active')
    bars.classList.toggle('change')
});






            