(defun alternate (lst1 lst2)
  (cond
    ((null lst1) lst2)
    ((null lst2) lst1)
    (t (cons (car lst1)
             (cons (car lst2)
                   (alternate (cdr lst1) (cdr lst2)))))
  )
)

(print (alternate '(10 20 30) '(40 50 60)))















; (defun my-append (lst1 lst2)
;   (if (null lst1)
;       lst2
;       (cons (car lst1) (my-append (cdr lst1) lst2))
;   )
; )

; (print (my-append '(10 20 30) '(40 50 60)))














; (defun remove-first (atom lst)
;   (cond
;     ((null lst) nil)
;     ((eq atom (car lst)) (cdr lst))
;     (t (cons (car lst) (remove-first atom (cdr lst))))
;   )
; )

; (print (remove-first 'a '(b a c a d)))













; (defun my-reverse (lst)
;   (if (null lst)
;       nil
;       (append (my-reverse (cdr lst)) (list (car lst)))
;   )
; )

; (print (my-reverse '(10 20 30 40)))









; (defun remove-last (lst)
;   (if (null (cdr lst))
;       nil
;       (cons (car lst) (remove-last (cdr lst)))
;   )
; )

; (print (remove-last '(10 20 30 40)))






; (defun last-element (lst)
;   (if (null (cdr lst))
;       (car lst)
;       (last-element (cdr lst))
;   )
; )

; (print (last-element '(10 20 30 40)))






; (defun diff-of-squares (x y)
;   (if (> x y)
;       (- (* x x) (* y y))
;       (- (* y y) (* x x))
;   )
; )

; (print (diff-of-squares 5 3))






; (defun sum-of-squares (x y)
;   (+ (* x x) (* y y))
; )

; (print (sum-of-squares 3 4))

