
from flask import  Flask
from flask_sqlalchemy import SQLAlchemy
from flask_script import Manager 
from flask_migrate import MigrateCommand,Migrate
from flask_login import LoginManager,UserMixin,login_required,login_user,logout_user
from werkzeug.security import generate_password_hash,check_password_hash




app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:////Users/fanish/Desktop/learning-curve/python/flask/src/data.db'
app.config['SECRET_KEY']='haifanish'

db=SQLAlchemy(app)
migrate=Migrate(app,db)
manager=Manager(app)
manager.add_command('db',MigrateCommand)

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

	def set_password(self,password):
		self.password=generate_password_hash(password)

	def check_password(self,password):
		return check_password_hash(self.password,password)



if __name__ == '__main__':
   manager.run()

