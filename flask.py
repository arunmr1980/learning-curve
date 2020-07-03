from flask import *
app = Flask(__name__)

@app.route('/hello')
def hello_world():
   return render_template('hello.html')

@app.route('/hai')
def hai():
   return 'hai'

if __name__ == '__main__':
   app.run()
