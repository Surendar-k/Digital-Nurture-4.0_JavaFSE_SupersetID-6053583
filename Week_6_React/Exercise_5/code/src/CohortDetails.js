import styles from './CohortDetails.module.css';

function CohortDetails(props) {
    // Destructure cohort for cleaner access
    const { cohort } = props;

    // Determine dynamic color based on status
    const statusColor = cohort.currentStatus.toLowerCase() === 'ongoing' ? 'green' : 'blue';

    return (
        <div className={styles.box}>
            <h3 style={{ color: statusColor }}>
                {cohort.cohortCode} - <span>{cohort.technology}</span>
            </h3>
            <dl>
                <dt>Started On</dt>
                <dd>{cohort.startDate}</dd>

                <dt>Current Status</dt>
                <dd>{cohort.currentStatus}</dd>

                <dt>Coach</dt>
                <dd>{cohort.coachName}</dd>

                <dt>Trainer</dt>
                <dd>{cohort.trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;
