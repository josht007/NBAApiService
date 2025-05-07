document.addEventListener("DOMContentLoaded", function() {
    fetch("/api/teams")
        .then(response => response.json())
        .then(data => {
            const teamsDiv = document.getElementById("teams");
            teamsDiv.innerHTML = "";

            data.data.forEach(team => {
                const teamDiv = document.createElement("div");
                teamDiv.classList.add("team");
                teamDiv.innerHTML = `
                    <h3>${team.full_name}</h3>
                    <p>City: ${team.city}</p>
                    <p>Conference: ${team.conference}</p>
                    <p>Division: ${team.division}</p>
                `;
                teamsDiv.appendChild(teamDiv);
            });
        })
        .catch(error => {
            console.error("Error fetching team data:", error);
        });
});
