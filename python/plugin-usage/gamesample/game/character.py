from typing import Protocol

class GameCHaracter(Protocol):

    def make_a_noice(self) -> None:
        """ Let character make a noise """
