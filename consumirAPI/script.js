$(document).ready(function(){
    loadHighPopulationCountries();
    loadPopulationIncrease();
    loadGrowthData();
    loadPopulationDecrease();
    loadPopulationIncreaseGrowth();
});

function loadHighPopulationCountries() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/v1/Datos/",
        dataType: "json",
        success: function(data){
            const ctx = document.getElementById('highPopulationChart').getContext('2d');
            const labels = data.map(item => item.Country);
            const values = data.map(item => item.Population);
            new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                        label: 'Población',
                        data: values,
                        backgroundColor: 'rgba(75, 192, 192, 0.2)',
                        borderColor: 'rgba(75, 192, 192, 1)',
                        borderWidth: 1
                    }]
                },
                options: {
                    scales: {
                        y: { beginAtZero: true }
                    }
                }
            });
        },
        error: function(xhr, status, error) {
            console.error("Error al cargar datos:", error);
        }
    });
}

function loadPopulationIncrease() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/v1/Datos/increase",
        dataType: "json",
        success: function(data){
            const ctx = document.getElementById('populationIncreaseChart').getContext('2d');
            const labels = data.map(item => item.Country);
            const values = data.map(item => item.populationIncrease);
            new Chart(ctx, {
                type: 'bar',
                data: {
                    labels: labels,
                    datasets: [{
                        label: 'Incremento de Población',
                        data: values,
                        backgroundColor: 'rgba(153, 102, 255, 0.2)',
                        borderColor: 'rgba(153, 102, 255, 1)',
                        borderWidth: 1
                    }]
                },
                options: {
                    scales: {
                        y: { beginAtZero: true }
                    }
                }
            });
        },
        error: function(xhr, status, error) {
            console.error("Error al cargar datos:", error);
        }
    });
}

function loadGrowthData() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/v1/Datos/increaseCountry",
        dataType: "json",
        success: function(data){
            const tableBody = $("#growthTable tbody");
            tableBody.empty();
            $.each(data, function(i, item){
                const row = `<tr>
                                <td>${item.Country}</td>
                                <td>${item.PopulationIncrease}</td>
                                <td>${item.GrowthPercentage}%</td>
                            </tr>`;
                tableBody.append(row);
            });
        },
        error: function(xhr, status, error) {
            console.error("Error al cargar datos:", error);
        }
    });
}

function loadPopulationDecrease() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/v1/Datos/populationDecrease",
        dataType: "json",
        success: function(data){
            const tableBody = $("#populationDecreaseTable tbody");
            tableBody.empty();
            $.each(data, function(i, item){
                const row = `<tr>
                                <td>${item.Country}</td>
                                <td>${item.populationDecrease}</td>
                                <td>${item.percentageDecrease}%</td>
                            </tr>`;
                tableBody.append(row);
            });
        },
        error: function(xhr, status, error) {
            console.error("Error al cargar datos:", error);
        }
    });
}

function loadPopulationIncreaseGrowth() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/v1/Datos/populationIncrease",
        dataType: "json",
        success: function(data){
            const tableBody = $("#populationIncreaseGrowthTable tbody");
            tableBody.empty();
            $.each(data, function(i, item){
                const populationIncrease = item.populationIncrease;
                const totalPopulation = 83280384; // Total de la población del mundo en 2017 (suponiendo este valor)
                const percentageIncrease = ((populationIncrease / totalPopulation) * 100).toFixed(2); // Calcular el porcentaje de incremento
                const row = `<tr>
                                <td>${item.Country}</td>
                                <td>${populationIncrease}</td>
                                <td>${percentageIncrease}%</td>
                            </tr>`;
                tableBody.append(row);
            });
        },
        error: function(xhr, status, error) {
            console.error("Error al cargar datos:", error);
        }
    });
}

