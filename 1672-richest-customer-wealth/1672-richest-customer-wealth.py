class Solution(object):
    def maximumWealth(self, accounts):
        n= len(accounts)
        m= n-1
        l= []
        k=0
        while k <= m:
            j= sum(accounts[k])
            l.append(j)
            k+=1
        i= max(l)
        return i