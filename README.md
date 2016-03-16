# Portfolio

Source code for my personal website; this is a new version written
in Clojure and Luminus. The [old one][portfolio-old] was written in Haskell.

## Running

To start a web server for the application, run:

    lein run

## What was used?

### Server

I use [luminus][luminus] framework with the default web stack (Compojure and Ring).

### CSS

[Garden][garden] as a CSS pre-processor replacement.

### Javascript

[ClojureScript][clojurescript] as Javascript replacement, this allows code sharing between the client and the server.

## License

Copyright © 2016 MIT

[clojure]: https://clojure.org/
[clojurescript]: https://github.com/clojure/clojurescript
[garden]: https://github.com/noprompt/garden
[luminus]: http://www.luminusweb.net/
[portfolio-old]: https://github.com/DanielRS/portfolio-haskell
