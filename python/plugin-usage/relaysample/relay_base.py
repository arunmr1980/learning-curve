from abc import ABCMeta, abstractMethod

class RelayBase(metaClass=ABCMeta):
    """Abstract Base class for Relay plugin"""

    def __init__(self) -> None:
        self.connected = False

    @abstractMethod
    def disconnect(self) -> None:

    @abstractMethod
    def connect(self) -> None:

    @abstractMethod
    def reconnect(self, seconds:int) -> None:
    """
    Disconnects for specified time and reconnects
    param seconds - sleep time
    """
