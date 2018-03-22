
(define render
	(lambda (lst)
		(let loop ((lst lst)(x ""))
				(define f
					(lambda (lst x)
						(string-append  x ((caar lst)
							(if (and (list? (cdar lst)) (pair? (cadar lst)))
								(if (or (null? (cddar lst)) (pair? (caddar lst)))
									(loop (cdar lst) "\n")
									(cons (loop (cadar lst) "\n") (cddar lst)))
								(cdar lst))))))
				(if (null? (cdr lst))
					(f lst x)
					(loop (cdr lst) (f lst x))))))
