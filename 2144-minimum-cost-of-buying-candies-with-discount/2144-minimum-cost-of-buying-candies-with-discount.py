class Solution(object):
    def minimumCost(self, cost):
        cost.sort(reverse=True)
        pwgf= 0
        for i in range(len(cost)):
            if i%3!=2:
                pwgf += cost[i]
        return pwgf