# Liber

Liber is a template parser for Scheme List to HTML


the procedure are named as HTML tags, they may accept an atom or a list

when it accept a atom, means:
```
(p "exemple")
=>
<p>exemple</p>
```

when it accepts a list, the seconde and third atom in the list copose a pair, and so on...
```
(p '("exemple" "class" "p's class" "color" "red"))
=>
<p class="p's class" color="red">exemple</p>
```

when the first atom is empty, must be a `""`

```
(script '("" "src" "https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"))
=>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
```
some procedures only accept a list
```
(link '("href" "http://fonts.googleapis.com/icon?family=Material+Icons" "rel" "stylesheet"))
=>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
```

the top and the child elements must be wrapped with `(list)` with we renamed `(!--)`

```
(!--
(html [BODY]))
```
```
(p
(!--
(p "exemple")))
=>
<p><p>exemple</p></p>
```

you can see the full usage in exemple.lbr
