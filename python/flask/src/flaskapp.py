from flask import  Flask,render_template,request,redirect,url_for
from flask_sqlalchemy import SQLAlchemy
from flask_login import LoginManager,UserMixin,login_required,login_user,logout_user
from werkzeug.security import generate_password_hash,check_password_hash
from models import User


app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:////Users/fanish/Desktop/learning-curve/python/flask/src/data.db'
app.config['SECRET_KEY']='haifanish'

db=SQLAlchemy(app)
login_manager=LoginManager()
login_manager.init_app(app)
login_manager.login_view='login'



@login_manager.user_loader
def load_user(user_id):
	return User.query.get(int(user_id))


@app.route('/home')
@login_required
def home():
	return render_template('home.html')



@app.route('/login',methods=['GET','POST'])
def login():
	if request.method == 'POST':
		uname=request.form['uname']
		pswd=request.form.get('pswd')
		print(uname,pswd)
		user=User.query.filter_by(username=uname).first()
		if user is not None:
			print(user.check_password(pswd))
			if user.check_password(pswd)==True:
				print("going to loginnnnnnnnnnn")
				login_user(user)
			else:
				msg="invalid credentials"
				# return '<script>window.alert("un authorised access"),window.location.href="/login"</script>'
				return render_template('login.html',msg=msg)
			return redirect(url_for('home'))
		else:
			msg="invalid credentials"
			# return '<script>window.alert("un authorised access"),window.location.href="/login"</script>'
			return render_template('login.html',msg=msg)

	else:
		return render_template('login.html')


@app.route('/logout')
@login_required
def logout():
	logout_user()
	return redirect(url_for('login'))

@app.route('/register', methods = ['GET', 'POST'])
def register():
	if request.method == 'POST':
		uname=request.form['uname']
		pswd=request.form['pswd']
		email=request.form['email']
		phone=request.form['phone']
		user=User(uname,pswd,email,phone)
		user.set_password(pswd)
		db.session.add(user)
		db.session.commit()
		# return '<script>window.alert("User Successfully Created"),window.location.href="/login"</script>'
		return redirect(url_for('login'))
	else:
   		return render_template('register.html')


if __name__ == '__main__':
   app.run(debug=True)
