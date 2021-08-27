(ns tower-of-hanoi.core)

(defn total-moves
  "Calculate the number of moves for the given number of disks.
  n is the total number of disks.
  Formula: (2 pow n) - 1"
  [n]
  (- (reduce * (repeat n 2)) 1))

(defn print-moves
  "Print all the moves for solving the puzzle.
  n is the total number of disks.
  from, to and aux are the names for the rods."
  [n from to aux]
  (if (= n 1)
    (println "Move disk 1 from" from "to" to)
    (do
      (print-moves (dec n) from aux to)
      (println "Move disk" n "from" from "to" to)
      (print-moves (dec n) aux to from))))

(comment
  ;; Gives you the total number of moves for 3 disks.
  (total-moves 3)

   ;; Print all the moves for 3 disks.
  (print-moves 3 "A" "C" "B"))
