class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        floor_count = [
            floor.count("1") for floor in bank if floor.count("1") > 0
        ]
        return sum(
            [
                floor_count[i] * floor_count[i + 1]
                for i in range(len(floor_count) - 1)
            ]
        )
