class Solution(object):
    def baseNeg2(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 0:
            return "0"
        ans = []

        while n != 0:

            rem = n % -2
            n = n // -2

            if rem < 0:
                rem += 2
                n += 1

            ans.append(str(rem))
            a=ans[::-1]

        return "".join(a)
    
            

        
        