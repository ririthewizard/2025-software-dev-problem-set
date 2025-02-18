class Solution:
    def is_palindrome(s:str) -> bool:
        check = "".join([char.lower() for char in s if char.isalnum()])
        return check == check[::-1]

    print(is_palindrome("racecar"))
    print(is_palindrome("racecar123"))
    print(is_palindrome("Racecar"))
    print(is_palindrome("race a car"))
    print(is_palindrome("racecar-%"))
    print(is_palindrome("rabbit"))
