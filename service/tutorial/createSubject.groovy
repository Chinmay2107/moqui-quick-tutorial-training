def subject = ec.entity.makeValue("example.Subject")
subject.setFields(context, true, null, null)
if (!subject.subjectId) subject.setSequencedIdPrimary()
subject.create()