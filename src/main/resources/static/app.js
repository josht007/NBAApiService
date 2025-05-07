document.addEventListener("DOMContentLoaded", function() {
    const teamsContainer = document.querySelector(".teams-container");
    const teams = Array.from(teamsContainer.children);

    teams.sort((a, b) => {
        const nameA = a.querySelector("h2").innerText;
        const nameB = b.querySelector("h2").innerText;
        return nameA.localeCompare(nameB);
    });

    teamsContainer.innerHTML = "";
    teams.forEach(team => teamsContainer.appendChild(team));
});
