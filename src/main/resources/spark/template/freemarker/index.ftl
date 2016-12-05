<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link rel="stylesheet" type="text/css" href="semantic/dist/semantic.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="semantic/dist/semantic.min.js"></script>
    <style type="text/css">
        body > .ui.container {
            margin-top: 3em;
        }

        .ui.container > h1 {
            font-size: 3em;
            text-align: center;
            font-weight: normal;
        }

        .ui.container > h2.dividing.header {
            font-size: 2em;
            font-weight: normal;
            margin: 4em 0em 3em;
        }

        .ui.table {
            table-layout: fixed;
        }
    </style>

</head>
<body>


<div class="ui container">

    <h2 class="ui header">Attached Content</h2>
    <div class="ui three column grid">
        <div class="column">
            <div class="top attached ui segment">
                Segment 1
            </div>
            <div class="attached ui segment">
                Segment 2
            </div>
            <div class="attached ui segment">
                Segment 2
            </div>
            <div class="bottom attached ui segment">
                Segment 3
            </div>
            <div class="ui segments">
                <div class="ui segment">
                    <p>Top</p>
                </div>
                <div class="ui segments">
                    <div class="ui segment">
                        <p>Nested Top</p>
                    </div>
                    <div class="ui segment">
                        <p>Nested Middle</p>
                    </div>
                    <div class="ui segment">
                        <p>Nested Bottom</p>
                    </div>
                </div>
                <div class="ui segment">
                    <p>Middle</p>
                </div>
                <div class="ui horizontal segments">
                    <div class="ui segment">
                        <p>Top</p>
                    </div>
                    <div class="ui segment">
                        <p>Middle</p>
                    </div>
                    <div class="ui segment">
                        <p>Bottom</p>
                    </div>
                </div>
                <div class="ui segment">
                    <p>Bottom</p>
                </div>
            </div>
        </div>
        <div class="column">
            <table class="top attached ui basic table">
                <thead>
                <th>Header</th>
                <th>Header</th>
                <th>Header</th>
                </thead>
                <tbody>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                </tbody>
            </table>
            <table class="attached ui table">
                <tbody>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                </tbody>
            </table>
            <table class="attached ui celled selectable table">
                <tbody>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                </tbody>
            </table>
            <table class="bottom attached ui celled table">
                <thead>
                <th>Header</th>
                <th>Header</th>
                <th>Header</th>
                </thead>
                <tbody>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                <tr>
                    <td>Cell</td>
                    <td>Cell</td>
                    <td>Cell</td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="column">
            <div class="top attached ui three item menu">
                <a class="item">Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>
            <div class="attached ui three item menu">
                <a class="item">Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>
            <div class="attached ui three item menu">
                <a class="item">Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>
            <div class="bottom attached ui three item menu">
                <a class="item">Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>

            <div class="ui top attached tabular menu">
                <a class="active item">Active Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>
            <div class="ui bottom attached segment">
                Segment
            </div>

            <div class="ui top attached menu">
                <a class="active item">Active Item</a>
                <a class="item">Item</a>
                <a class="item">Item</a>
            </div>
            <div class="ui bottom attached segment">
                Segment
            </div>

        </div>
    </div>
</div>
</body>
</html>