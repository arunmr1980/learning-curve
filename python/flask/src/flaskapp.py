from flask import  Flask,render_template,request,redirect,url_for
from flask_sqlalchemy import SQLAlchemy
from flask_login import LoginManager,UserMixin

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:////Users/fanish/Desktop/learning-curve/python/flask/src/data.db'
app.config['SECRET_KEY']='haifanish'

db=SQLAlchemy(app)
login_manager=LoginManager()
login_manager.init_app(app)


class User(UserMixin,db.Model):
	id=db.Column(db.Integer,primary_key=True)
	username=db.Column(db.String(30),unique=True)
	password=db.Column(db.String(10))
	mobile=db.Column(db.Integer)
	email=db.Column(db.String(10))

	def __init__(self,username,password,mobile,email):
		self.username=username
		self.password=password
		self.mobile=mobile
		self.email=email


@login_manager.user_loader
def load_user(user_id):
	return User.query.get(int(user_id))


@app.route('/home')
def home():

	return render_template('home.html')


@app.route('/login',methods=['GET','POST'])
def login():
	if request.method == 'POST':
		uname=request.form['uname']
		pswd=request.form['pswd']
		user=User.query.get(username=uname,password=pswd)
		login_user(user)
		return redirect(url_for('home'))

	else:
		return render_template('login.html')



@app.route('/register', methods = ['GET', 'POST'])
def register():
	if request.method == 'POST':
		uname=request.form['uname']
		pswd=request.form['pswd']
		email=request.form['email']
		phone=request.form['phone']
		user=User(uname,pswd,email,phone)
		db.session.add(user)
		db.session.commit()
		# return '<script>window.alert("User Successfully Created"),window.location.href="/login"</script>'
		return redirect(url_for('login'))
	else:
   		return render_template('register.html')


if __name__ == '__main__':
   app.run(debug=True)
