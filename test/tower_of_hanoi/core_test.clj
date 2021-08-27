(ns tower-of-hanoi.core-test
  (:require [clojure.test :refer :all]
            [tower-of-hanoi.core :refer :all]))

(deftest total-moves-test
  (testing "for disk count 0."
    (is (= 0 (total-moves 0))))

  (testing "for disk count 1."
    (is (= 1 (total-moves 1))))

  (testing "for disk count 2."
    (is (= 3 (total-moves 2))))

  (testing "for disk count 9."
    (is (= 511 (total-moves 9))))

  (testing "for disk count -1."
    (is (= 0 (total-moves -1))))

  (testing "for disk count 0.1."
    (is (= 0 (total-moves 0.1)))))

(deftest print-moves-test
  (testing "for 0 disks"
    (is (= nil (print-moves 1 "A" "C" "B")))))
