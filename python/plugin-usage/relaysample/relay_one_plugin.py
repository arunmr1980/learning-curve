class RelayOne(RelayBase):

    def __init__(self):
        super().__init()

    def disconnect(self):
        self.connected = False
        print("Disconnected one")

    def connect(self):
        self.connected = True
        print("Connected one")

    def reconnect(self, seconds: int = 5):
        self.seconds = seconds
        self.disconnect()
        print(f"One paused for {seconds} seconds .....")
        self.connect()
