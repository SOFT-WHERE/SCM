let currentTheme=getTheme()

function changeTheme(params) {
    
}

function setTheme(theme){
    localStorage.setItem("theme",theme)
}

function getTheme(){
    let theme=localStorage.getItem("theme")
    return theme?theme:"light"
}