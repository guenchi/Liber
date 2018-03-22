(library (liber liber)
  (export
  )
  (import
    (scheme)
  )


(define !-- list)

(define bcstr
	(lambda (x y)
		(if (list? y)
			(string-append "<" x " "
				(let loop ((y (cdr y)))
					(if (null? (cddr y))
						(string-append (car y) "=\"" (cadr y))
						(string-append (car y) "=\"" (cadr y) "\" " (loop (cddr y))))) "\">" (car y) "</" x ">\n")
			(string-append "<" x ">" y "</"x ">\n"))))

(define cstr
	(lambda (x y)
		(string-append "<" x " "
			(let loop ((y y))
				(if (null? (cddr y))
					(string-append (car y) "=\"" (cadr y))
					(string-append (car y) "=\"" (cadr y) "\" " (loop (cddr y))))) "\" />\n" )))

(define HTML
	(lambda (x)
		(bcstr "html" x)))

(define HEAD
	(lambda (x)
		(bcstr "head" x)))

(define BODY
	(lambda (x)
		(bcstr "body" x)))

(define TITLE
	(lambda (x)
		(bcstr "title" x)))

(define LINK
	(lambda (x)
		(cstr "link" x)))

(define SCRIPT
	(lambda (x)
		(bcstr "script" x)))

(define P
	(lambda (x)
		(bcstr "p" x)))
  
(define A
	(lambda (x)
		(bcstr "a" x)))

(define DIV
	(lambda (x)
		(bcstr "div" x)))

(define SPAN
	(lambda (x)
		(bcstr "span" x)))

(define META
	(lambda (x)
		(cstr "meta" x)))

(define IMG
	(lambda (x)
		(cstr "img" x)))

(define H1
	(lambda (x)
		(bcstr "h1" x)))

(define H2
	(lambda (x)
		(bcstr "h2" x)))

(define H3
	(lambda (x)
		(bcstr "h3" x)))

(define H4
	(lambda (x)
		(bcstr "h4" x)))

(define H5
	(lambda (x)
		(bcstr "h5" x)))

(define html
	(lambda (x)
		(cons HTML x)))

(define head
	(lambda (x)
		(cons HEAD x)))

(define body
	(lambda (x)
		(cons BODY x)))

		
(define title
	(lambda (x)
		(cons TITLE x)))

(define link
	(lambda (x)
		(cons LINK x)))


(define script
	(lambda (x)
		(cons SCRIPT x)))

(define p
	(lambda (x)
		(cons P x)))

(define a
	(lambda (x)
		(cons A x)))

(define div
	(lambda (x)
		(cons DIV x)))


(define span
	(lambda (x)
		(cons SPAN x)))


(define meta
	(lambda (x)
		(cons META x)))


(define img
	(lambda (x)
		(cons IMG x)))

(define h1
	(lambda (x)
		(cons H1 x)))

(define h2
	(lambda (x)
		(cons H2 x)))

(define h3
	(lambda (x)
		(cons H3 x)))

(define h4
	(lambda (x)
		(cons H4 x)))

(define h5
	(lambda (x)
        (cons H5 x)))


(define render
	(lambda (lst)
		(let loop ((lst lst)(x ""))
				(define f
					(lambda (lst x)
						(string-append x ((caar lst)
							(if (and (list? (cdar lst)) (pair? (cadar lst)))
								(if (or (null? (cddar lst)) (pair? (caddar lst)))
									(loop (cdar lst) "\n")
									(cons (loop (cadar lst) "\n") (cddar lst)))
								(cdar lst))))))
				(if (null? (cdr lst))
					(f lst x)
					(loop (cdr lst) (f lst x))))))
 
 )
