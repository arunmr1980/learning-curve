class RelayTwo(RelayBase):

    def __init__(self):
        super().__init()

    def disconnect(self):
        self.connected = False
        print("Disconnected two")

    def connect(self):
        self.connected = True
        print("Connected two")

    def reconnect(self, seconds: int = 5):
        self.seconds = seconds
        self.disconnect()
        print(f"Two paused for {seconds} seconds .....")
        self.connect()
