/**
 * Employees page
 */

/**
 * Switch additional employee filters
 */
$('#employees-additional-filters').on('change', function() {
    if($(this).children(":selected").attr("id") === 'option-1') {
        $('#free-guides').removeClass('hidden');
        $('#free-guides').addClass('visible');
    } else {
        $('#free-guides').removeClass('visible');
        $('#free-guides').addClass('hidden');
    }
});

/**
 * Exhibits page
 */

/**
 * Switch exhibit filters
 */
$('#exhibit-additional-filters').on('change', function() {
    if($(this).children(":selected").attr("id") === 'option-1') {
        $('#by-author').removeClass('hidden');
        $('#by-author').addClass('visible');

        $('#by-employee').addClass('hidden');

        $('#by-audience').addClass('hidden');
    } else if($(this).children(":selected").attr("id") === 'option-2') {
        $('#by-employee').removeClass('hidden');
        $('#by-employee').addClass('visible');

        $('#by-author').addClass('hidden');

        $('#by-audience').addClass('hidden');
    } else if($(this).children(":selected").attr("id") === 'option-3') {
        $('#by-audience').removeClass('hidden');
        $('#by-audience').addClass('visible');

        $('#by-author').addClass('hidden');

        $('#by-employee').addClass('hidden');
    } else {
        $('#by-author').addClass('hidden');
        $('#by-employee').addClass('hidden');
        $('#by-audience').addClass('hidden');
    }
});

/**
 * Add employee page
 */

/**
 * Show audience input only if employee position is an Audience manager
 */
$('#employee-positions').on('change', function() {
    if($(this).children(":selected").attr("id") === 'option-2') {
        // $('#employee-is-am').removeClass('hidden');
        // $('#employee-is-am').addClass('visible');
        $('#employee-is-am').css('display', 'block');
    } else {
        // $('#employee-is-am').removeClass('visible');
        // $('#employee-is-am').addClass('hidden');
        $('#employee-is-am').css('display', 'none');
    }
});

/**
 * Statistics
 */

/**
 * Exhibit stats
 */
new Chart(document.getElementById("horizontalBar"), {
    "type": "horizontalBar",
    "data": {
        "labels": ["Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Grey"],
        "datasets": [{
            "label": "My First Dataset",
            "data": [22, 33, 55, 12, 86, 23, 14],
            "fill": false,
            "backgroundColor": ["rgba(255, 99, 132, 0.2)", "rgba(255, 159, 64, 0.2)",
                "rgba(255, 205, 86, 0.2)", "rgba(75, 192, 192, 0.2)", "rgba(54, 162, 235, 0.2)",
                "rgba(153, 102, 255, 0.2)", "rgba(201, 203, 207, 0.2)"
            ],
            "borderColor": ["rgb(255, 99, 132)", "rgb(255, 159, 64)", "rgb(255, 205, 86)",
                "rgb(75, 192, 192)", "rgb(54, 162, 235)", "rgb(153, 102, 255)", "rgb(201, 203, 207)"
            ],
            "borderWidth": 1
        }]
    },
    "options": {
        "scales": {
            "xAxes": [{
                "ticks": {
                    "beginAtZero": true
                }
            }]
        }
    }
});