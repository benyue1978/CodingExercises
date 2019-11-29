import unittest

from trapping_rain_water import Solution


class Exe1Test(unittest.TestCase):

    def test_1(self):
        sol  = Solution()
        self.assertEqual(6, sol.trap([0,1,0,2,1,0,1,3,2,1,2,1]))

    def test_2(self):
        sol  = Solution()
        self.assertEqual(2, sol.trap([2,0,2]))
