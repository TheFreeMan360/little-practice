class Pieces():
    def __init__(self, init_x:int, init_y:int) -> None:
        self.__x = init_x
        self.__y = init_y

    @property
    def x(self):
        return self.__x
    
    @x.setter
    def set_x(self, new_x):
        self.__x = new_x

    @property
    def y(self):
        return self.__y
    
    @y.setter
    def set_x(self, new_y):
        self.__y = new_y

    def move(self, new_x, new_y):
        pass

    def is_valid_move(self, board_state, new_x, new_y) -> bool:
        pass

    def say(self):
        print("hello i am a piece")

class King(Pieces):

    def __init__(self, init_x, init_y, is_white) -> None:
        super().__init__(init_x, init_y)
        self.__is_white = is_white

    def is_valid_move(self, board_state, new_x, new_y) -> bool:
        if new_x >= 8 or new_y >= 8:return False
        if abs(new_x - self.x) > 1 or abs(new_y - self.y) > 1:return False
        if board_state[new_x][new_y] != 0:return False

        return True

    def say(self):
        print(f"hello i am a { 'white' if  self.__is_white else 'black'} king")

class Queen(Pieces):

    def __init__(self, init_x, init_y, is_white) -> None:
        super().__init__(init_x, init_y)
        self.__is_white = is_white

    def is_valid_move(self, board_state, new_x, new_y) -> bool:
        
        return True

    def say(self):
        print(f"hello i am a { 'white' if  self.__is_white else 'black'} king")


class Board():
    def __init__(self) -> None:
        self.__board_width = 8
        self.__board_height = 8
        self.__board = [[0 for i in range(self.__board_width)]
                         for j in range(self.__board_height)]
    
    def get_board(self):
        return self.__board

    def set_board(self):
        pass

    def print_board(self):
        for i in range(self.__board_height):
            for j in range(self.__board_width):
                print(self.__board[i][j], end='')
            print()

PIECES = {
    0: '空', 
    1: 'K', 
    2: 'Q',
    3: 'R',
    4: 'B',
    5: 'N',
    6: 'P',
}

print("7777 8888")