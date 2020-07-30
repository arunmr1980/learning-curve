from wtforms import Form, BooleanField, StringField, PasswordField, validators

class RegistrationForm(Form):
    id = StringField('Id')
    username=StringField('Username',[validators.Length(min=6, max=35),validators.DataRequired()])
    email = StringField('Email Address', [validators.Length(min=6, max=35)])
    mobile = StringField('Phone', [validators.Length(min=6, max=35)])
    password = PasswordField('Password', [validators.DataRequired()])

