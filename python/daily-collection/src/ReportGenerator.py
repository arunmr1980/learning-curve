import json
from datetime import datetime

with open('input.json', 'r') as f:
    data = json.load(f)
d = {}

for record in data:
    receipt_date = datetime.strptime(record["receipt_date"][:10], "%Y-%m-%d").strftime("%Y-%m-%d")
    try:
        emp_key = record["collected_by_employee_key"]
    except KeyError:
        emp_key = ""
    total_amt = 0
    for itm in record["payments"]:
        total_amt += itm["amount"]
    if receipt_date not in d:
        d[receipt_date] = {
            "collection_date": receipt_date,
            "collection_by_employees": [
                {
                    "employee_key": emp_key,
                    "total_amount": total_amt
                }
            ],
            "fee_receipts": [record["receipt_key"]],
            # "payment_modes": [],
            "total_collection_amount": total_amt,
            "total_discount_amount": 0,
            "total_fine_amount": 0
        }
    else:
        d[receipt_date]["collection_by_employees"].append(
                {
                    "employee_key": emp_key,
                    "total_amount": total_amt
                })
        d[receipt_date]["fee_receipts"].append(record["receipt_key"])
        d[receipt_date]["total_collection_amount"] += total_amt
print(json.dumps(d, indent=4))

