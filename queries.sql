## Part 1: Test it with SQL

SELECT * FROM techjobs.job;

## Part 2: Test it with SQL

SELECT location FROM techjobs.employer;

## Part 3: Test it with SQL

DELETE from job

## Part 4: Test it with SQL

SELECT skill.name, description
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.jobs_id
WHERE id is NOT NULL
ORDER BY name ASC