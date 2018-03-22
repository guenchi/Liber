# Liber

Liber is a template parser for Scheme List to HTML


the procedure are named as HTML tags, they may accept a atom or a list

when it accept a atom, means:
```
(p "exemple")
=>
<p>exemple</p>
```

when it accept a list, the seconde and third atom in the list copose a pair, and so on...
```
(p '("exemple" "class" "p's class" "color" "red"))
=>
<p class="p's class" color="red">exemple</p>
```
the top and the child elements must be wrapped with `(list)` with we renamed `(!--)

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
