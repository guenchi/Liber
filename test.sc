(import (liber liber))

(render (eval (call-with-input-file "exemple.lbr" read)))
