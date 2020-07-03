from flask import *
app = Flask(__name__)

@app.route('/hello')
def hello_world():
   x={'numbers':[1,2,3,4]}
	return jsonify(x)

@app.route('/hai')
def hai():
   return 'hai'

if __name__ == '__main__':
   app.run()
