/*script to do the 'X' moviment on the bars*/
const bars = document.querySelector('.menu-toggle .barsMovimet')
/*script to do the moviment of the toggle menu*/
const menuToggle = document.querySelector('.menu-toggle');
const nav = document.querySelector('nav');
menuToggle.addEventListener('click', () => {
    nav.classList.toggle('active')
    bars.classList.toggle('change')
});
/*script to change the home photo*/
const changePhoto = document.querySelector('.bg-parlex');
const oldPhoto = document.querySelector('.bg-parlex-new');








/*over quote
function noiseOut()
{
    document.getElementById('quoteNoise').setAttribute('../../WebLab_1-1/img/Gibran-wall.jpg');
}
function noiseIn()
{
    document.getElementById('quoteNoise').src = "../../WebLab_1-1/img/Gibran-wall-noise.jpg";
}*/

            