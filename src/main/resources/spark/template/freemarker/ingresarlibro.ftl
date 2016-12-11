<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ingresar</title>

    <link rel="stylesheet" type="text/css" href="/semantic/dist/semantic.min.css">

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="/semantic/dist/semantic.min.js"></script>

    <style>

        body {
            background-color: #e6e6e6;
        }
        body > .grid {
            height: 100%;
        }
        .image {
            margin-top: -100px;
        }
        .column {
            max-width: 450px;
        }

    </style>
</head>
<body>
<div class="ui middle aligned center aligned grid">
    <div class="column">
        <h2 class="ui teal image header">
            <div class="content">
                Ingreso de libros
            </div>
        </h2>
        <form class="ui large form" action="/form/ingresarlibro" method="POST">
            <div class="ui stacked segment">
                <div class="field">
                    <div class="ui input">
                        <input type="text" name="codigo_clasificacion" placeholder="Codigo de clasificacion">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="titulo" placeholder="Titulo">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="formato" placeholder="Formato">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="isbn" placeholder="ISBN">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="autor" placeholder="Autor">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="pie_imprenta" placeholder="Pie de imprenta">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="paginas" placeholder="Paginas">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="descripcion" placeholder="Descripcion">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <input type="text" name="idioma" placeholder="Idioma">
                    </div>
                </div>

                <div class="field">
                    <div class="ui input">
                        <button class="ui button" type="submit">Registrar</button>
                    </div>
                </div>

            </div>
        </form>
    </div>
</div>
</body>
</html>